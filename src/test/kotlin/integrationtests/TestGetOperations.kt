package integrationtests

import org.jsmart.zerocode.core.domain.TargetEnv
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner
import org.junit.runner.RunWith
import org.junit.Test
import org.jsmart.zerocode.core.domain.JsonTestCase
import org.jsmart.zerocode.core.domain.EnvProperty


@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner::class)
class TestGetOperations {
	
	 @Test
	 @JsonTestCase("integration_tests/get/get_all_runners.json")
	 fun test_get_all_runners() {
	 }
	
}