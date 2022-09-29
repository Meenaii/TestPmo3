package ut.ru.pmo.test3;

import org.junit.Test;
import ru.pmo.test3.api.MyPluginComponent;
import ru.pmo.test3.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}