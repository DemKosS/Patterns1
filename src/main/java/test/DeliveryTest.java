package test;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DeliveryTest {
    private final String name;
    private final String phoneNumber;
    private final String city;

}