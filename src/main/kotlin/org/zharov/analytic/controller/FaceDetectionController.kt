package org.zharov.analytic.controller

import org.zharov.analytic.controller.dto.MediaDto
import org.zharov.analytic.service.MediaService
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/detect")
class FaceDetectionController(@Inject private val mediaService: MediaService) {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun saveDetection(detection: MediaDto): Response {
        return Response.ok().build()
    }
}

