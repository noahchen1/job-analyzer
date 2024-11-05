package com.example.job_analyzer.service;

import org.springframework.stereotype.Service;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

@Service
public class JobScraperService {

    public void scrapeJobs() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();

            String jobUrl = "https://www.indeed.com/jobs?q=Java+Developer&l=Remote";
            page.navigate(jobUrl);

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            browser.close();
        }
    }
}
