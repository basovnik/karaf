/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.karaf.itests.features;

import org.apache.karaf.itests.KarafTestSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerClass;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerClass.class)
public class EnterpriseFeaturesTest extends KarafTestSupport {

    @Test
    public void installTransaction100Feature() throws Exception {
        installAssertAndUninstallFeature("transaction", "1.0.0");
    }

    @Test
    public void installTransaction101Feature() throws Exception {
        installAssertAndUninstallFeature("transaction", "1.0.1");
    }

    @Test
    public void installTransaction110Feature() throws Exception {
        installAssertAndUninstallFeature("transaction", "1.1.0");
    }

    @Test
    public void installConnector222Feature() throws Exception {
        installAssertAndUninstallFeature("connector", "2.2.2");
    }

    @Test
    public void installConnector311Feature() throws Exception {
        installAssertAndUninstallFeature("connector", "3.1.1");
    }

    @Test
    public void installJpaFeature() throws Exception {
    	installAssertAndUninstallFeatures("jpa");
    }

    @Test
    public void installOpenJpa222Feature() throws Exception {
        installAssertAndUninstallFeature("openjpa", "2.2.2");
    }

    @Test
    public void installOpenJpa230Feature() throws Exception {
        installAssertAndUninstallFeature("openjpa", "2.3.0");
    }

    @Test
    public void installHibernate332GAFeature() throws Exception {
        installAssertAndUninstallFeature("hibernate", "3.3.2.GA");
    }

    @Test
    public void installHibernate4215FinalFeature() throws Exception {
        installAssertAndUninstallFeature("hibernate", "4.2.15.Final");
    }

    @Test
    public void installHibernateEnvers4215FinalFeature() throws Exception {
        installAssertAndUninstallFeature("hibernate-envers", "4.2.15.Final");
    }

    @Test
    public void installHibernate436FinalFeature() throws Exception {
        installAssertAndUninstallFeature("hibernate", "4.3.6.Final");
    }

    @Test
    public void installHibernateEnvers436FinalFeature() throws Exception {
        installAssertAndUninstallFeature("hibernate-envers", "4.3.6.Final");
    }

    @Test
    public void installHibernateValidatorFeature() throws Exception {
        installAssertAndUninstallFeatures("hibernate-validator");
    }

    @Test
    public void installJndiFeature() throws Exception {
    	installAssertAndUninstallFeatures("jndi");
    }

    @Test
    public void installJdbcFeature() throws Exception {
        installAssertAndUninstallFeatures("jdbc");
    }

    @Test
    public void installJmsFeature() throws Exception {
        installAssertAndUninstallFeatures("jms");
    }

    @Test
    public void installOpenWebBeansFeature() throws Exception {
        installAssertAndUninstallFeatures("openwebbeans");
    }

    @Test
    public void installWeldFeature() throws Exception {
        installAssertAndUninstallFeatures("weld");
    }

    @Test
    public void installApplicationWithoutIsolationFeature() throws Exception {
    	installAssertAndUninstallFeatures("application-without-isolation");
    }

    @Test
    public void installSubsystems() throws Exception {
        installAssertAndUninstallFeatures("subsystems");
    }

}
