package com.nineleaps.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.nineleaps.demopackageB.DemoBeanB1;
import com.nineleaps.demopackageB.DemoBeanB2;

@Configuration
@ComponentScan(basePackages = {"com.nineleaps.demopackageA",
							   "com.nineleaps.demopackageC",
							   "com.nineleaps.demopackageD",
							   "com.nineleaps.demopackageB"
								},
			   includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = DemoBeanB2.class),
			   basePackageClasses = DemoBeanB1.class,
			   useDefaultFilters = true)
public class BlogPostsApplication {

}
