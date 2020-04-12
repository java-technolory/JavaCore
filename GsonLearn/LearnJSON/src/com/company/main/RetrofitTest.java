package com.company.main;

import com.company.model.*;
import com.company.remote.ApiRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RetrofitTest {
    private final static String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static Gson gson;
    private static ApiRequest apiRequest;

    /**
     * retrofit: GET, POST, DELETE, UPDATE, PATCH
     */

    public static void main(String[] args) {

        //
        Dispatcher dispatcher = new Dispatcher(Executors.newFixedThreadPool(20));
        dispatcher.setMaxRequests(20);
        dispatcher.setMaxRequestsPerHost(1);

        //
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .dispatcher(dispatcher)
                .connectionPool(new ConnectionPool(100, 30, TimeUnit.SECONDS))
                .addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request originalRequest = chain.request();
                        Request newRequest = originalRequest
                                .newBuilder()
                                .header("Interceptor-Header", "xyz")
                                .build();
                        return chain.proceed(newRequest);
                    }
                })
                .addInterceptor(loggingInterceptor)
                .build();

        //
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        //
        apiRequest = retrofit.create(ApiRequest.class);
        gson = new GsonBuilder().setPrettyPrinting().create();

        // Get All Posts
        getPosts();

        // Get Post By User Id
        // https://jsonplaceholder.typicode.com/posts?userId=1
//        getPostByUserIdUseQuery(1);

        // Get Post By Id
//        getPostById(2);

        // Create Post
//        createPost();

        // Update Post By Id
//        updatePostById(1);

        // Patch Post By Id
//        patchPostById(1);

        // Delete Post By Id
//        deletePostById(1);

        // Get All Comments
//        getComments();

        // Get Comments By Post Id Use Query
        // https://jsonplaceholder.typicode.com/comments?postId=1
//        getCommentByPostIdUseQuery(1);

        // Get Comments By Post Id
        // https://jsonplaceholder.typicode.com/posts/1/comments
//        getCommentByPostIdUsePatch(1);

        // Get All Albums
//        getAlbums();

        // Get All Photos
//        getPhotos();

        // Get All Todos
//        getTodos();

        // Get All Users
//        getUsers();

    }

    //
    private static void getPosts() {
        Call<List<PostModel>> post = apiRequest.getPosts();
        post.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable throwable) {

            }
        });
    }

    //
    private static void getPostByUserIdUseQuery(Integer userId) {

        apiRequest.getPostByUserIdUseQuery("abc", userId).enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable throwable) {

            }
        });

        //
//        Integer[] id = {1, 2, 3};
//        String sort = "id";
//        String order = "desc";
//        apiRequest.getPostByUserIdUseQuery(id, sort, order).enqueue(new Callback<List<PostModel>>() {
//            @Override
//            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
//                if (response.isSuccessful()) {
//                    System.out.println(gson.toJson(response.body()));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<PostModel>> call, Throwable throwable) {
//                System.err.println("ERROR!");
//            }
//        });

        //
//        apiRequest.getPostByUserIdUseQuery(1, 2, 3, null, null).enqueue(new Callback<List<PostModel>>() {
//            @Override
//            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
//                if (response.isSuccessful()) {
//                    System.out.println(gson.toJson(response.body()));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<PostModel>> call, Throwable throwable) {
//                System.err.println("ERROR!");
//            }
//        });

        //
//        Map<String, String> parameters = new HashMap<>();
//        parameters.put("userId", "1");
//        parameters.put("_sort", "id");
//        parameters.put("_order", "desc");
//        apiRequest.getPostByUserIdUseQuery(parameters).enqueue(new Callback<List<PostModel>>() {
//            @Override
//            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
//                if (response.isSuccessful()) {
//                    System.out.println(gson.toJson(response.body()));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<PostModel>> call, Throwable throwable) {
//
//            }
//        });

    }

    //
    private static void getPostById(int id) {
        Call<PostModel> call = apiRequest.getPostById(id);
        call.enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable throwable) {

            }
        });
    }

    //
    private static void createPost() {
//        PostModel post = new PostModel(1, "New Title", "New Body");
//        apiRequest.createPost(post).enqueue(new Callback<PostModel>() {
//            @Override
//            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
//                if (response.isSuccessful()) {
//                    System.out.println(gson.toJson(response.body()));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<PostModel> call, Throwable throwable) {
//
//            }
//        });

        //
//        apiRequest.createPost(1, "New Title", "New Body").enqueue(new Callback<PostModel>() {
//            @Override
//            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
//                if (response.isSuccessful()) {
//                    System.out.println(gson.toJson(response.body()));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<PostModel> call, Throwable throwable) {
//
//            }
//        });

        //
        Map<String, String> fileds = new HashMap<>();
        fileds.put("userId", "1");
        fileds.put("title", "New Title Map");
        fileds.put("body", "New Body Map");
        apiRequest.createPost(fileds).enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable throwable) {

            }
        });
    }

    //
    private static void updatePostById(int id) {
        PostModel post = new PostModel(2, "New Title", "New Body");
        Map<String, String> headers = new HashMap<>();
        headers.put("Map-Header1", "def");
        headers.put("Map-Header2", "ghi");
        apiRequest.updatePostById(headers, post, 1).enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable throwable) {

            }
        });
    }

    //
    private static void patchPostById(int id) {
        Integer userId = 2;
        String title = null;
        String body = "New Body Patch";
        apiRequest.patchPostById(id, userId, title, body).enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable throwable) {

            }
        });
    }

    //
    private static void deletePostById(int id) {
        apiRequest.deletePostById(id).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    System.out.println("Delete Success!");
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable throwable) {

            }
        });
    }

    //
    private static void getComments() {
        Call<List<CommentModel>> call = apiRequest.getComments();
        call.enqueue(new Callback<List<CommentModel>>() {
            @Override
            public void onResponse(Call<List<CommentModel>> call, Response<List<CommentModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<CommentModel>> call, Throwable throwable) {

            }
        });
    }

    //
    private static void getCommentByPostIdUsePatch(int postId) {
        apiRequest.getCommentByPostIdUsePath(postId).enqueue(new Callback<List<CommentModel>>() {
            @Override
            public void onResponse(Call<List<CommentModel>> call, Response<List<CommentModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<CommentModel>> call, Throwable throwable) {

            }
        });
    }

    //
    private static void getCommentByPostIdUseQuery(int postId) {
        apiRequest.getCommentByPostIdUseQuery(postId).enqueue(new Callback<List<CommentModel>>() {
            @Override
            public void onResponse(Call<List<CommentModel>> call, Response<List<CommentModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<CommentModel>> call, Throwable throwable) {

            }
        });
    }

    //
    private static void getAlbums() {
        Call<List<Album>> call = apiRequest.getAlbums();
        call.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable throwable) {

            }
        });
    }

    //
    private static void getPhotos() {
        Call<List<PhotoModel>> call = apiRequest.getPhotos();
        call.enqueue(new Callback<List<PhotoModel>>() {
            @Override
            public void onResponse(Call<List<PhotoModel>> call, Response<List<PhotoModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<PhotoModel>> call, Throwable throwable) {

            }
        });
    }

    //
    private static void getTodos() {
        apiRequest.getTodos().enqueue(new Callback<List<TodoModel>>() {
            @Override
            public void onResponse(Call<List<TodoModel>> call, Response<List<TodoModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<TodoModel>> call, Throwable throwable) {

            }
        });
//        Call<List<Todo>> call = apiRequest.getTodos();
//        call.enqueue(new Callback<List<Todo>>() {
//            @Override
//            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
//                if (response.isSuccessful()) {
//                    System.out.println(gson.toJson(response.body()));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Todo>> call, Throwable throwable) {
//
//            }
//        });
    }

    //
    private static void getUsers() {
        apiRequest.getUsers().enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                if (response.isSuccessful()) {
                    System.out.println(gson.toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable throwable) {

            }
        });
    }

    //


}

