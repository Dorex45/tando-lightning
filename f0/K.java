/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package F0;

import F0.k;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;

public final class k
extends x
implements P {
    private static final k DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int ivSize_;

    static {
        k k2;
        DEFAULT_INSTANCE = k2 = new k();
        x.Q(k.class, k2);
    }

    private k() {
    }

    public static k W() {
        return DEFAULT_INSTANCE;
    }

    public static b Y() {
        return (b)DEFAULT_INSTANCE.q();
    }

    private void Z(int n2) {
        this.ivSize_ = n2;
    }

    public int X() {
        return this.ivSize_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object t(x.d object, Object object2, Object object3) {
        switch (a.a[object.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                object2 = PARSER;
                object = object2;
                if (object2 != null) return object;
                Class<k> clazz = k.class;
                synchronized (k.class) {
                    try {
                        object2 = PARSER;
                        object = object2;
                        if (object2 != null) return object;
                        object = new x.b(DEFAULT_INSTANCE);
                        PARSER = object;
                        // ** MonitorExit[var4_5] (shouldn't be in output)
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                return x.I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new k();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(int n2) {
            this.l();
            ((k)this.e).Z(n2);
            return this;
        }
    }
}

