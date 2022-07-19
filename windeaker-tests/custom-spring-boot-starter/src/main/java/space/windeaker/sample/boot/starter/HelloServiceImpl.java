package space.windeaker.sample.boot.starter;

import org.springframework.stereotype.Service;

/**
 * TODO: HelloServiceImpl 注释
 *
 * @author xq
 * @date 2022/7/19
 */
@Service
public class HelloServiceImpl implements HelloService{
	@Override
	public void sayHello(String theirName) {
		System.out.println(String.format("hello,%s!",theirName));
	}
}
