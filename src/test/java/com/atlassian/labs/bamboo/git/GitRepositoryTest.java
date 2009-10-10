package com.atlassian.labs.bamboo.git;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

import edu.nyu.cs.javagit.api.JavaGitException;
import edu.nyu.cs.javagit.api.Ref;
import edu.nyu.cs.javagit.api.commands.GitCheckout;
import edu.nyu.cs.javagit.api.commands.GitCheckoutOptions;
import org.junit.Test;

/**
 * Testing {@link com.atlassian.labs.bamboo.git.ExampleReport}
 */
public class GitRepositoryTest extends TestCase
{
    public void testBasic()
    {
        // add test here...
    }
    @Test
    public void testcLONE() throws IOException, JavaGitException {
        GitRepository gitRepository = new GitRepository();
        gitRepository.setRemoteBranch("feature1");
        File sourceDir = getCheckoutDirectory();
        gitRepository.cloneOrFetch(sourceDir, "git://github.com/krosenvold/bgit-unittest.git");
    }

    @Test
    public void testStatus() throws IOException, JavaGitException {
        GitRepository gitRepository = new GitRepository();
        gitRepository.setRemoteBranch("feature1");
        File sourceDir = getCheckoutDirectory();
        gitRepository.cloneOrFetch(sourceDir, "git://github.com/krosenvold/bgit-unittest.git");

        Ref ref = gitRepository.gitStatus(sourceDir);

    }

    @Test
    public void testReferencesDifferentRepository() throws IOException, JavaGitException {
        GitRepository gitRepository = new GitRepository();
        gitRepository.setRemoteBranch("feature1");
        File sourceDir = getCheckoutDirectory();
    //    gitRepository.cloneOrFetch(sourceDir, "git://github.com/krosenvold/bgit-unittest.git");

  //      assertFalse (gitRepository.referencesDifferentRepository());

 //       GitCheckout checkout = new GitCheckout();
  //      checkout.checkout( sourceDir, new GitCheckoutOptions(), Ref.createBranchRef("feature2"));

//        assertFalse (gitRepository.referencesDifferentRepository());
    }

    private File getCheckoutDirectory() {
        File projectDir = new File("testRepo");
        if (!projectDir.exists()) projectDir.mkdir();
        File sourceDir = new File("testRepo/checkout");
        return sourceDir;
    }

}