package com.personal.springboot.studentservices;

import java.net.InetAddress;

import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    public String getServerAddress() throws Exception {

        final String serverAddress = InetAddress.getLocalHost().getHostAddress();

        return serverAddress;

    }

}
