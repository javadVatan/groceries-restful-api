package javad.vatan.podimagameapi.user.web.rest


import javad.vatan.podimagameapi.api.UserResource
import javad.vatan.podimagameapi.user.service.AppUserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class AppUserController(private val service: AppUserService) : UserResource {

}