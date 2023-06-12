package africa.semicolon.wisp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean public ModelMapper modelMapper(){
        var modelMapper = new ModelMapper();
        System.out.println(modelMapper);
        return modelMapper;
    }
}
