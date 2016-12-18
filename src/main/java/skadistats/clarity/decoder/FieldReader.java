package skadistats.clarity.decoder;

import skadistats.clarity.decoder.bitstream.BitStream;
import skadistats.clarity.model.DTClass;
import skadistats.clarity.model.FieldPath;
import skadistats.clarity.model.state.Cursor;
import skadistats.clarity.model.state.EntityState;

import java.io.PrintStream;

public abstract class FieldReader<T extends DTClass> {

    public static final int MAX_PROPERTIES = 0x3FFF;
    public static PrintStream DEBUG_STREAM = System.out;

    protected final Cursor[] cursors = new Cursor[MAX_PROPERTIES];

    public FieldPath[] getFieldPaths() {
        // TODO
        return null;
    }

    public abstract int readFields(BitStream bs, T dtClass, EntityState state, boolean debug);
    public abstract int readDeletions(BitStream bs, int indexBits, int[] deletions);

}
