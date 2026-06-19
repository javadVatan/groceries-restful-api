package javad.vatan.podimagameapi.user.service

import javad.vatan.podimagameapi.auth.service.ClientSessionService
import javad.vatan.podimagameapi.user.repository.AppUserRepository
import org.springframework.stereotype.Service

@Service
class AppUserServiceImpl(
//    private val passwordEncoder: PasswordEncoder,
    private val repository: AppUserRepository,
//    private val mapper: UserInfoMapper,
    private val service: ClientSessionService
) : AppUserService {
/*
    override fun changeEmail(request: Map<String, String>): UserInfoResponse {
        val currentUser: AppUser = service.findCurrentSessionUser()

        val newEmail = request["email"] ?: throw BadRequestException("The new email is missing in the request")
        validateEmail(newEmail, currentUser.id)

        currentUser.email = newEmail
        val updatedUser = repository.save(currentUser)

        return mapper.toDto(updatedUser)
    }

    override fun changePassword(request: UserPasswordUpdateRequest) {
        val user: AppUser = service.findCurrentSessionUser()

        if (!passwordEncoder.matches(request.currentPassword, user.password)) {
            throw PasswordMismatchException("The current password is wrong!")
        }
        if (request.newPassword != request.newPasswordConfirmation) {
            throw PasswordMismatchException("Your new password does not match with the password confirmation!")
        }

        user.clientPassword = passwordEncoder.encode(request.newPassword)
        repository.save(user)
    }

    override fun changeInfo(request: UserInfoUpdateRequest): UserInfoResponse {
        val user: AppUser = service.findCurrentSessionUser()

        user.apply {
            this.firstName = request.firstName ?: firstName
            this.lastName = request.lastName ?: lastName
        }

        val savedUser: AppUser = repository.save(user)
        return mapper.toDto(savedUser)
    }

    override fun fetchInfo(): UserInfoResponse {
        val user: AppUser = service.findCurrentSessionUser()
        return mapper.toDto(user)
    }

    fun validateEmail(email: String, currentUserId: Long) {
        val emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$"
        if (!email.matches(emailRegex.toRegex())) {
            throw BadRequestException("Invalid email format")
        }
        repository.findByEmail(email)?.let { user ->
            if (user.id != currentUserId) {
                throw BadRequestException("Email is already used by another user")
            }
        }
    }*/
}