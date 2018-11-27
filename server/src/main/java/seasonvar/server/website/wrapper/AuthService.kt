package seasonvar.server.website.wrapper

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthService {

    @POST("/?mod=login")
    @FormUrlEncoded
    fun login(
        @Field("login") login: String,
        @Field("password") password: String
    ): Single<Response<ResponseBody>>

}
