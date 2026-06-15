package com.dspattern.creational.behavioral.chain.example2;

/**
 * Concrete filter that handles authentication object
 * <p>
 * If authentication fails, the chain is terminated,
 * Else, control is passed to the next filter in the chain
 */
public class AuthFilter implements Filter {

    //Reference to the next filter
    private Filter nextFilter;

    @Override
    public void setNext(Filter filter) {
        this.nextFilter = filter;
    }

    @Override
    public void apply(Request request) {
        System.out.println("AuthFilter: checking authentication for " + request.getPayload());

        if (authenticate(request)) {
            request.setAttributes("authenticated", true);
            System.out.println("AuthFilter: authentication successful");
        } else {
            request.setAttributes("authenticated", false);
            System.out.println("AuthFilter: authentication failed - stopping chain");
            return;
        }

        if (nextFilter != null)
            nextFilter.apply(request);
    }

    //Helper method (trivial implementation)
    private boolean authenticate(Request request) {

        //Check if the request payload contains the string "auth"
        String payload = request.getPayload();

        return payload.contains("auth");
    }
}
