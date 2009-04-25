package edu.nyu.cs.javagit.client;

import java.io.File;
import java.io.IOException;

import edu.nyu.cs.javagit.api.JavaGitException;
import edu.nyu.cs.javagit.api.Ref;

public interface IGitSubmodule
{
    void init(File repoDirectory)
            throws JavaGitException, IOException;

    void update(File repoDirectory)
            throws JavaGitException, IOException;
}
