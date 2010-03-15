package org.apache.sling.jcr.davex.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.jackrabbit.jcr2spi.Jcr2SpiTestSuite;
import org.apache.jackrabbit.test.JCRTestSuite;

/**
 * @author justin
 *
 */
public class ConformanceTest extends TestCase {

    public static Test suite() {
        System.setProperty("known.issues", "<!--*****PLEASEupdatespi2dav/pom.xmlaswell*****-->"
                + "<!--JCR-2536:PathNotFoundExinsteadofInvalidItemStateEx.-->"
                + "org.apache.jackrabbit.test.api.NodeTest#testSaveInvalidStateException"
                + "org.apache.jackrabbit.test.api.NodeTest#testRemoveInvalidItemStateException"
                + "org.apache.jackrabbit.test.api.SessionTest#testSaveInvalidStateException"
                + "<!--wrongexception:ConstraintViolationEx.insteadSAXException/InvalidSerializedDataEx.-->"
                + "org.apache.jackrabbit.test.api.SerializationTest#testNodeTypeConstraintViolationWorkspace"
                + "<!--notyetdebugged:unknownreason-->"
                + "org.apache.jackrabbit.test.api.WorkspaceCopySameNameSibsTest#testCopyNodesNodeExistsAtDestPath"
                + "org.apache.jackrabbit.test.api.WorkspaceMoveSameNameSibsTest#testMoveNodesNodeExistsAtDestPath"
                + "<!--JCR-2538:impersonationnotimplemented-->" + "org.apache.jackrabbit.test.api.ImpersonateTest"
                + "<!--JCR-2099:shareablenodes-->" + "org.apache.jackrabbit.test.api.ShareableNodeTest"
                + "<!--JCR-2228:lifecyclemanagement-->" + "org.apache.jackrabbit.test.api.LifecycleTest"
                + "<!--locktokentransfer-->"
                + "org.apache.jackrabbit.test.api.lock.LockManagerTest#testAddInvalidLockToken"
                + "org.apache.jackrabbit.test.api.lock.LockManagerTest#testAddLockTokenToAnotherSession"
                + "org.apache.jackrabbit.test.api.lock.LockManagerTest#testLockTransfer2"
                + "<!--JCR-2454:nodetyperegistration-->"
                + "org.apache.jackrabbit.test.api.nodetype.NodeTypeCreationTest#testRegisterNodeType"
                + "org.apache.jackrabbit.test.api.nodetype.NodeTypeCreationTest#testRegisterNodeTypes"
                + "<!--JCR-2539:userdata(observation)-->"
                + "org.apache.jackrabbit.test.api.observation.GetUserDataTest"
                + "<!--JCR-2540:move/reorder(observation)-->"
                + "org.apache.jackrabbit.test.api.observation.NodeMovedTest"
                + "org.apache.jackrabbit.test.api.observation.NodeReorderTest"
                + "org.apache.jackrabbit.test.api.observation.GetIdentifierTest#testNodeMoved"
                + "org.apache.jackrabbit.test.api.observation.GetIdentifierTest#testNodeRemoved"
                + "org.apache.jackrabbit.test.api.observation.WorkspaceOperationTest#testRename"
                + "org.apache.jackrabbit.test.api.observation.WorkspaceOperationTest#testMove"
                + "<!--JCR-2541:eventjournal-->" + "org.apache.jackrabbit.test.api.observation.EventJournalTest"
                + "<!--JCR-2542:eventfilter-->"
                + "org.apache.jackrabbit.test.api.observation.AddEventListenerTest#testNodeType"
                + "org.apache.jackrabbit.test.api.observation.AddEventListenerTest#testNoLocalTrue"
                + "<!--JCR-2533:missingimplofcheckQueryStatement-->"
                + "org.apache.jackrabbit.test.api.query.CreateQueryTest#testUnknownQueryLanguage"
                + "<!--JCR-2543:queryoffset-->" + "org.apache.jackrabbit.test.api.query.SetOffsetTest#testSetOffset"
                + "<!--JCR-2533:missingimplofcheckQueryStatement-->"
                + "org.apache.jackrabbit.test.api.query.qom.BindVariableValueTest"
                + "<!--JCR-2535:Row.getPath()calledwithmultipleselectors(server-side)-->"
                + "org.apache.jackrabbit.test.api.query.qom.ChildNodeJoinConditionTest"
                + "org.apache.jackrabbit.test.api.query.qom.ColumnTest#testMultiColumn"
                + "org.apache.jackrabbit.test.api.query.qom.DescendantNodeJoinConditionTest"
                + "org.apache.jackrabbit.test.api.query.qom.EquiJoinConditionTest"
                + "org.apache.jackrabbit.test.api.query.qom.OrderingTest#testMultipleSelectors"
                + "org.apache.jackrabbit.test.api.query.qom.SameNodeJoinConditionTest"
                + "<!--JCR-2112:simpleversioningnotimplemented-->" + "org.apache.jackrabbit.test.api.version.simple"
                + "<!--JCR-2104:activitiesandconfiguration-->"
                + "org.apache.jackrabbit.test.api.version.ActivitiesTest"
                + "org.apache.jackrabbit.test.api.version.MergeActivityTest#testMergeActivity"
                + "org.apache.jackrabbit.test.api.version.ConfigurationsTest" + "" + "<!--knownissue!?-->"
                + "org.apache.jackrabbit.jcr2spi.ReorderReferenceableSNSTest#testReorder2" + ""
                + "<!--isSameshouldcomparepathsinsteadofids!?-->"
                + "org.apache.jackrabbit.jcr2spi.IsSameTest#testIsSameProperty3"
                + "org.apache.jackrabbit.jcr2spi.IsSameTest#testIsSameProperty4"
                + "org.apache.jackrabbit.jcr2spi.IsSameTest#testIsSameNode7" + "" + "<!--knownissue!?-->"
                + "org.apache.jackrabbit.jcr2spi.name.NamespaceRegistryTest#testReRegisteredNamespace"
                + "org.apache.jackrabbit.jcr2spi.name.NamespaceRegistryTest#testReRegisteredNamespaceVisibility" + ""
                + "<!--JCR-2547:SettingapropertywhichhasbeentransientlyremovedfailswithaPathNotFoundException-->"
                + "org.apache.jackrabbit.jcr2spi.AddPropertyTest#testReplacingProperty"
                + "org.apache.jackrabbit.jcr2spi.AddPropertyTest#testReplacingProperty2"
                + "org.apache.jackrabbit.jcr2spi.AddPropertyTest#testAddingProperty"
                + "org.apache.jackrabbit.jcr2spi.AddPropertyTest#testAddingProperty2" + ""
                + "<!--JCR-2548:Node#unlocksometimesfailswithLockException:PreconditionFailed-->"
                + "org.apache.jackrabbit.jcr2spi.lock.OpenScopedLockTest#testLogoutHasNoEffect");
        TestSuite suite = new TestSuite();
        // if (Boolean.getBoolean("jackrabbit.test.integration")) {
        suite.addTest(new JCRTestSuite());
        suite.addTest(new Jcr2SpiTestSuite());
        //suite.addTest(org.apache.jackrabbit.test.api.TestAll.suite());
        // }
        return suite;
    }
}
