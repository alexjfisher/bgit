package com.atlassian.labs.bamboo.git;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

import edu.nyu.cs.javagit.api.JavaGitException;

/**
 * Testing {@link com.atlassian.labs.bamboo.git.ExampleReport}
 */
public class TestExampleReport extends TestCase
{
    public void testBasic()
    {
        // add test here...
    }

    public void testcLONE() throws IOException, JavaGitException {
        GitRepository gitRepository = new GitRepository();
        gitRepository.setRemoteBranch("feature1");
        File projectDir = new File("testRepo");
        if (!projectDir.exists()) projectDir.mkdir();
        File sourceDir = new File("testRepo/checkout");
        System.out.println("sourceDir.getAbsolutePath() = " + sourceDir.getAbsolutePath());
        System.out.println("sourceDir.getAbsolutePath() = " + sourceDir.getParentFile().getAbsolutePath());
        gitRepository.cloneOrFetch(sourceDir, "git://github.com/krosenvold/bgit-unittest.git");
    }
}