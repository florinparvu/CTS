package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCarteSetarePret.class, TestCarteTitlu.class,
		TestCarteTitluNull.class, TestCarteTitluReturnat.class })
public class AllTestsCarte {

}
