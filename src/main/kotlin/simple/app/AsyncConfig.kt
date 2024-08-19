package simple.app

import org.springframework.scheduling.annotation.AsyncConfigurer
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import org.springframework.context.annotation.Configuration
import java.util.concurrent.Executor

@Configuration
@EnableAsync
class AsyncConfig: AsyncConfigurer {
    override fun getAsyncExecutor(): Executor {
        val executor : ThreadPoolTaskExecutor = ThreadPoolTaskExecutor();
        val processors = Runtime.getRuntime().availableProcessors();

        executor.setCorePoolSize(processors);
        executor.setMaxPoolSize(processors * 2);
        executor.setQueueCapacity(50);
        executor.setKeepAliveSeconds(60);
        executor.setThreadNamePrefix("AsyncExecutor-");
        executor.initialize();

        return executor;
    }
}