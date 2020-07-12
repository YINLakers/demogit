package com.zznode.demogit.rest;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


	/**
	 * spring-boot-demo-2-1
	 * 
	 * @author wujing
	 */
	@RestController
	@RequestMapping(value = "/index")
	public class AppControl {

		@RequestMapping
		public String index() {
			return "hello world";
		}

		// @RequestParam 简单类型的绑定，可以出来get和post
		@RequestMapping(value = "/get")
		public HashMap<String, Object> get(@RequestParam String name) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("title", "hello world");
			map.put("name", name);
			return map;
		}

		
		@RequestMapping(value = "/getAge")
		public HashMap<String, Object> getAge() {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("Born", "19930118");
			return map;
		}

	}