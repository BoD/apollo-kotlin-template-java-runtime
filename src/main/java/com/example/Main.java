package com.example;

import com.apollographql.apollo3.ApolloCall;
import com.apollographql.apollo3.ApolloClient;
import com.apollographql.apollo3.api.ApolloResponse;
import com.apollographql.apollo3.rx3.Rx3Apollo;
import io.reactivex.rxjava3.core.Single;

public class Main {
    public static void main(String[] av) {
        ApolloClient apolloClient = new ApolloClient.Builder()
                .serverUrl("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
                .build();

        ApolloCall<LaunchListQuery.Data> queryCall = apolloClient.query(new LaunchListQuery());
        Single<ApolloResponse<LaunchListQuery.Data>> queryResponse = Rx3Apollo.single(queryCall);
        queryResponse.subscribe(response -> {
            System.out.println(response.data);
            apolloClient.dispose();
        });
    }
}
