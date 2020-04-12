package com.company.remote;

import com.company.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface ApiRequest {

    @GET("posts")
    Call<List<PostModel>> getPosts();

    // https://jsonplaceholder.typicode.com/posts?userId=1
    @Headers({"Static-Header1: 456", "Static-Header2: 789"})
    @GET("posts")
    Call<List<PostModel>> getPostByUserIdUseQuery(@Header("Dynamic-Header") String header,
                                                  @Query("userId") Integer id);

    // https://jsonplaceholder.typicode.com/posts?userId=1&userId=2&userId=3&_sort=id&_order=desc
    @GET("posts")
    Call<List<PostModel>> getPostByUserIdUseQuery(@Query("userId") Integer userId1,
                                                  @Query("userId") Integer userId2,
                                                  @Query("userId") Integer userId3,
                                                  @Query("_sort") String sort,
                                                  @Query("_order") String order
    );

    // https://jsonplaceholder.typicode.com/posts?userId=1&userId=2&userId=3&_sort=id&_order=desc
    @GET("posts")
    Call<List<PostModel>> getPostByUserIdUseQuery(@Query("userId") Integer[] userId,
                                                  @Query("_sort") String sort,
                                                  @Query("_order") String order
    );

    // https://jsonplaceholder.typicode.com/posts?userId=1&_sort=id&_order=desc
    // @QueryMap: ko sử dụng đc với các parameter trùng nhau (vd: ko thể sử dụng 2 params userId)
    @GET("posts")
    Call<List<PostModel>> getPostByUserIdUseQuery(@QueryMap Map<String, String> parameters);

    @Headers("Static-Header: 123")
    @GET("posts/{id}")
    Call<PostModel> getPostById(@Path("id") Integer id);

    @POST("posts")
    Call<PostModel> createPost(@Body PostModel post);

    @POST("posts")
    @FormUrlEncoded
    Call<PostModel> createPost(@Field("userId") int userId,
                               @Field("title") String title,
                               @Field("body") String body);

    @POST("posts")
    @FormUrlEncoded
    Call<PostModel> createPost(@FieldMap Map<String, String> fileds);

    @PUT("posts/{id}")
    Call<PostModel> updatePostById(@HeaderMap Map<String, String> headers,
                                   @Body PostModel post,
                                   @Path("id") Integer id);

    @PATCH("posts/{id}")
    @FormUrlEncoded
    Call<PostModel> patchPostById(@Path("id") Integer id,
                                  @Field("userId") Integer userId,
                                  @Field("title") String title,
                                  @Field("body") String body);

    @DELETE("posts/{id}")
    Call<Void> deletePostById(@Path("id") Integer id);

    @GET("comments")
    Call<List<CommentModel>> getComments();

    @GET("comments/")
    Call<List<CommentModel>> getCommentByPostIdUseQuery(@Query("postId") Integer postId);

    @GET("posts/{id}/comments")
    Call<List<CommentModel>> getCommentByPostIdUsePath(@Path("id") Integer postId);

    @GET("albums")
    Call<List<Album>> getAlbums();

    @GET("photos")
    Call<List<PhotoModel>> getPhotos();

    @GET("todos")
    Call<List<TodoModel>> getTodos();

    @GET("users")
    Call<List<UserModel>> getUsers();
}
