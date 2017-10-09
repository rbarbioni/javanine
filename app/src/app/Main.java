package app;

import core.GithubClient;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
        GithubClient client = new GithubClient();
        String profileJson = client.getProfile("https://api.github.com/users/rbarbioni");
        System.out.println("return = " + profileJson);
    }
}
