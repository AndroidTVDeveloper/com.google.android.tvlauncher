package p000;

import java.lang.reflect.Constructor;

/* renamed from: aog */
/* compiled from: PG */
public final class aog implements aol {

    /* renamed from: a */
    private static final Constructor f1495a;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(aoi.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException e) {
            constructor = null;
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f1495a = constructor;
    }

    /* renamed from: a */
    public final synchronized aoi[] mo1201a() {
        aoi[] aoiArr;
        aoiArr = new aoi[(f1495a == null ? 13 : 14)];
        aoiArr[0] = new apk(0);
        aoiArr[1] = new aqg((byte) 0);
        aoiArr[2] = new aql((byte) 0);
        aoiArr[3] = new apo((byte) 0);
        aoiArr[4] = new aro((byte) 0);
        aoiArr[5] = new ark();
        aoiArr[6] = new ass((byte) 0);
        aoiArr[7] = new aoy();
        aoiArr[8] = new aqw();
        aoiArr[9] = new asj();
        aoiArr[10] = new asz();
        aoiArr[11] = new aow((byte) 0);
        aoiArr[12] = new arm();
        if (f1495a != null) {
            try {
                aoiArr[13] = (aoi) f1495a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return aoiArr;
    }
}
