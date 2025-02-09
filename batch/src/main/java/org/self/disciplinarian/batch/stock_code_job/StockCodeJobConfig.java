package org.self.disciplinarian.batch.stock_code_job;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.Slf4j;


import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class StockCodeJobConfig {
    @Bean
    public Job job1(JobRepository jobRepository){
        return new JobBuilder("job1")
                .start(step1)
                .build();
    }
}