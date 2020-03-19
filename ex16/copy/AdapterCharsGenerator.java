package t_09_interfaces.ex16.copy;

import java.io.IOException;
import java.nio.CharBuffer;

public class AdapterCharsGenerator extends CharsGenerator implements Readable {
    private int count;

    public AdapterCharsGenerator(int count)
    {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException
    {
        if (count-- == 0)
            return -1;
        cb.append(this.next());

        return 10;
    }

}
