package com.harena.api.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.harena.api.PojaGenerated;

@PojaGenerated
@SuppressWarnings("all")
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
