package com.dspattern.behavioral.chain.example3;

public class TrimFilter implements Filter {

    private Filter nextFilter;

    @Override
    public void setNext(Filter filter) {
        nextFilter = filter;
    }

    @Override
    public void apply(Request request) {
        System.out.println("TrimFilter: trimming payload " + request.getPayload());

        String payload = request.getPayload();
        String trimmedPayload = payload.trim();
        request.setPayload(trimmedPayload);

        System.out.println("TrimFilter: After trimming payload " + request.getPayload());

        //just an academic example ... we could simulate this
        request.setAttributes("trimmed", true);

        //Continue to next filter if available
        if (nextFilter != null) {
            nextFilter.apply(request);
        }
    }
}
