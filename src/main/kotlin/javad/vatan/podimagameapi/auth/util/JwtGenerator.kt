package javad.vatan.podimagameapi.auth.util

import javad.vatan.podimagameapi.error.JwtKeyException
import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import javax.crypto.SecretKey

@Configuration
@ConfigurationProperties(prefix = "jwt")
class JwtConfig {
    lateinit var secretKey: String
}

@Component
class KeyGenerator(private val config: JwtConfig) {
    fun generateHmacShaKey(): SecretKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(config.secretKey))
}

@Component
class JwtKey(private val keyGenerator: KeyGenerator) {

    private val log = LoggerFactory.getLogger(JwtKey::class.java)

    val secretKey: SecretKey by lazy {
        try {
            keyGenerator.generateHmacShaKey()
        } catch (ise: IllegalStateException) {
            log.error("Error decoding JWT secret key: ${ise.message}")
            throw JwtKeyException("Invalid JWT secret key")
        }
    }
}