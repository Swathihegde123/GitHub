package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class GitHubApplication {

//	echo "# GitHub" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Swathihegde123/GitHub.git
//	git push -u origin main
	
	public static void main(String[] args) {
		SpringApplication.run(GitHubApplication.class, args);
	}

	
	@RequestMapping("/welcome")
	public String getMethod()
	{
		return "Welcome to GitHub";
	}
}
