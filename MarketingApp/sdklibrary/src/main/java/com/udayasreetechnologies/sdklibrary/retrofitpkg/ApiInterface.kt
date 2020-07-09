package com.udayasreetechnologies.sdklibrary.retrofitpkg

import com.udayasreetechnologies.sdklibrary.retrofitpkg.models.AllCategoryModel
import com.udayasreetechnologies.sdklibrary.retrofitpkg.models.HomeMainModel
import com.udayasreetechnologies.sdklibrary.retrofitpkg.models.PostalMainModel
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @GET
    fun getPostalDetailApi(@Url url : String) : Call<PostalMainModel>

    @FormUrlEncoded
    @POST("/demowebsite/customrest/jsonapidetails/getHomejson")
    fun getHomeMainApi(
        @Field("consumerKey") consumerKey: String,
        @Field("consumerSecret") consumerSecret: String,
        @Field("leveltype") leveltype: String,
        @Field("packageId") packageId: String,
        @Field("appVersion") appVersion: String
    ): Call<HomeMainModel>

    @FormUrlEncoded
    @POST("/demowebsite/customrest/jsonapidetails/getcategoryAll")
    fun getAllCategoryApi(
        @Field("consumerKey") consumerKey: String,
        @Field("consumerSecret") consumerSecret: String,
        @Field("leveltype") leveltype: String,
        @Field("packageId") packageId: String,
        @Field("appVersion") appVersion: String,
        @Field("parentId") parentId: String
    ): Call<List<AllCategoryModel>>




    /*
    1. http://68.183.82.193/demowebsite/customrest/jsonapidetails/getHomejson
(consumerKey,consumerSecret,packageId,appVersion)

2. http://68.183.82.193/demowebsite/customrest/staticorder/setUserBillingAddress
(emailId,consumerKey,consumerSecret,,packageId,appVersion,fName,lName,street0,street1,postcode,addressType,landmark,country,region,city,password,reqType=>SIGN_UP)

3. http://68.183.82.193/demowebsite/customrest/jsonapidetails/getcategoryAll
(consumerKey,consumerSecret,,packageId,appVersion,parentId,leveltype)

4. http://68.183.82.193/demowebsite/customrest/jsonapidetails/getproductbycategory
(consumerKey,consumerSecret,,packageId,appVersion,categoryId)

5. http://68.183.82.193/demowebsite/customrest/jsonapidetails/getproductdetail
(consumerKey,consumerSecret,,packageId,appVersion,productId)
     */
}