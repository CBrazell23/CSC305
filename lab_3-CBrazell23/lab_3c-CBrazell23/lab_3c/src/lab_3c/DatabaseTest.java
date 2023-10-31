package lab3c;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

class DatabaseTest {

	@Test
	void test() {
		Database dbMock = mock(Database.class);
		Service service = new Service(dbMock);
		when(dbMock.getUniqueId()).thenReturn(42);
		assertEquals(service.getDatabaseID(), "Using database with id: 42");
	}

}
