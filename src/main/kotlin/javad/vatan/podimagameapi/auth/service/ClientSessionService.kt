package javad.vatan.podimagameapi.auth.service

import javad.vatan.podimagameapi.user.entity.AppUser
import org.springframework.security.core.Authentication

interface ClientSessionService {

    fun retrieveAuthentication(): Authentication?

    fun findCurrentSessionUser(): AppUser

    fun getAuthenticatedUser(): AppUser
}