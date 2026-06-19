package javad.vatan.podimagameapi.auth.service

import javad.vatan.podimagameapi.error.UserNotFoundException
import javad.vatan.podimagameapi.user.entity.AppUser
import javad.vatan.podimagameapi.user.repository.AppUserRepository
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service

@Service
class ClientSessionServiceImpl(private val repository: AppUserRepository) : ClientSessionService {

    override fun retrieveAuthentication(): Authentication? {
        return SecurityContextHolder.getContext().authentication
    }

    override fun findCurrentSessionUser(): AppUser {
        val authentication: Authentication =
            retrieveAuthentication() ?: throw UserNotFoundException("Authenticated user not found")

        val username = when (val principal = authentication.principal) {
            is UserDetails -> principal.username
            else -> principal.toString()
        }

        return repository.findByAppUsername(username)
            ?: throw UserNotFoundException("User not found with username: $username")
    }

    override fun getAuthenticatedUser(): AppUser {
        val authentication: Authentication? = retrieveAuthentication()
        return authentication?.principal as AppUser
    }
}