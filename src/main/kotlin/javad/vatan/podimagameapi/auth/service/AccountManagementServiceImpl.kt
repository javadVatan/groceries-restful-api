package javad.vatan.podimagameapi.auth.service

import javad.vatan.podimagameapi.user.repository.AppUserRepository
import org.slf4j.LoggerFactory
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AccountManagementServiceImpl(
    private val jwtService: JwtService,
    private val userRepository: AppUserRepository,
) : AccountManagementService {

    companion object {
        private const val TEN_CHARACTERS = 10
    }

    private val log = LoggerFactory.getLogger(javaClass)

}