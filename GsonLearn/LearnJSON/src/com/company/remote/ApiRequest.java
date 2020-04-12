package com.company.remote;

import com.company.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ApiRequest {
    @GET("posts")
    Call<List<PostModel>> getPosts();

    @GET("posts")
    Call<List<PostModel>> getPostByUserIdUseQuery(@Query("userId") Integer id);

    @GET("posts/{id}")
    Call<PostModel> getPostById(@Path("id") Integer id);

    @POST("posts")
    Call<PostModel> insertPost(@Body PostModel post);

    @PUT("posts/{id}")
    Call<PostModel> updatePostById(@Body PostModel post, @Path("id") Integer id);

    @PATCH("posts/{id}")
    @FormUrlEncoded
    Call<PostModel> patchPostById(@Path("id") Integer id, @Field("userId") Integer userId, @Field("title") String title, @Field("body") String body);

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
