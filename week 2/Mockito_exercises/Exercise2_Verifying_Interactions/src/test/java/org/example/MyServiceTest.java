package org.example;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.service.MyService;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create service with mocked dependency
        MyService service = new MyService(mockApi);

        // Step 3: Call method
        service.fetchData();

        // Step 4: Verify interaction with the mock
        verify(mockApi).getData();  
    }
}