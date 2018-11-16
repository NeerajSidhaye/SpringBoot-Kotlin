package integrationtests

import org.junit.runner.RunWith
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner
import org.jsmart.zerocode.core.domain.TargetEnv
import org.jsmart.zerocode.core.domain.JsonTestCase
import org.junit.Test

@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner::class)
class TestPatchOperations {
	
	@Test
	 @JsonTestCase("integration_tests/patch/patch_runner_profile.json")
	 fun `patch runner profile`() {
		 
	}
}