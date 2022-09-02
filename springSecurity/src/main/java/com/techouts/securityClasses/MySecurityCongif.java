package com.techouts.securityClasses;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug = true)
public class MySecurityCongif extends WebSecurityConfigurerAdapter 
{

}
