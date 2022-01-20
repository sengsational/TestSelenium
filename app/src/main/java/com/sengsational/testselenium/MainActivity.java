package com.sengsational.testselenium;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try (WebClient webClient = new WebClient()) {
            webClient.setCssErrorHandler(new SilentCssErrorHandler());
            HtmlPage page = webClient.getPage("https://www.wetator.org/testform/");
            //System.out.println(page.asNormalizedText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}