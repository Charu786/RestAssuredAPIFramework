package charusagarapitests;

import charusagarapibase.BaseTest;
import charusagarapiclient.APIClient;
import charusagarapiutils.JsonUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAPITests extends BaseTest {

    APIClient apiClient = new APIClient();
    @Test
    public void testGetPosts() {
        Response response = apiClient.get("/posts");
        System.out.println("GET /posts Response: " + JsonUtils.prettyPrint(response.asString()));
        Assert.assertEquals(response.getStatusCode(),200, "Status code should be 200");
    }
    @Test
    public void testCreatePost() {
        String requestBody = "{ \"title\": \"fool\", \"body\": \"bar\", \"userId\": 1}";
            Response response = apiClient.post("/posts", requestBody);
            System.out.println("POST /posts Response: " + JsonUtils.prettyPrint(response.asString()));
            Assert.assertEquals(response.getStatusCode(),201, "Status code should be 201");
    }
    @Test
    public void testUpdatePost() {
        String requestBody = "{ \"title\": \"updated title\", \"body\": \"updated body\", \"userId\": 1}";
        Response response = apiClient.put("/posts/1", requestBody);
        System.out.println("PUT /posts/1 Response: " + JsonUtils.prettyPrint(response.asString()));
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
    }
    @Test
    public void testDeletePost() {
        Response response = apiClient.delete("/posts/1");
        System.out.println("DELETE /posts/1 Response: " + JsonUtils.prettyPrint(response.asString()));
        Assert.assertEquals(response.getStatusCode(), 201, "Status code should be 201");
    }
}
