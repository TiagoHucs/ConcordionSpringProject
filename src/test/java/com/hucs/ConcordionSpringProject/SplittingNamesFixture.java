package com.hucs.ConcordionSpringProject;

public class SplittingNamesFixture extends DefaultFixture{

    public Result split(String fullName) {
        Result result = new Result();
        String[] words = fullName.split(" ");
        result.firstName = words[0];
        result.lastName = words[1];
        return result;
    }

    class Result {
        public String firstName;
        public String lastName;
    }

}

