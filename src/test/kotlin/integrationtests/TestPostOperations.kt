package integrationtests

import org.jsmart.zerocode.core.domain.JsonTestCase
import org.jsmart.zerocode.core.domain.TargetEnv
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner
import org.junit.runner.RunWith
import org.junit.Test

@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner::class)
class TestPostOperations {
	
	 @Test
	 @JsonTestCase("integration_tests/post/create_new_runner.json")
	 fun test_post_create_runner() {
		 
	}
	
}