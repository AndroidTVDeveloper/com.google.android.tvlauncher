package p000;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Parcel;

/* renamed from: cyy */
/* compiled from: PG */
public final class cyy {

    /* renamed from: a */
    public static final String[] f7936a = {"sbn_key", "package_name", "title", "text", "dismissible", "ongoing", "small_icon", "channel", "progress", "progress_max", "has_content_intent", "big_picture", "content_button_label", "dismiss_button_label", "tag"};

    /* renamed from: b */
    public final String f7937b;

    /* renamed from: c */
    public final String f7938c;

    /* renamed from: d */
    public final String f7939d;

    /* renamed from: e */
    public final String f7940e;

    /* renamed from: f */
    public final boolean f7941f;

    /* renamed from: g */
    public final boolean f7942g;

    /* renamed from: h */
    public final Icon f7943h;

    /* renamed from: i */
    public final int f7944i;

    /* renamed from: j */
    public final int f7945j;

    /* renamed from: k */
    public final int f7946k;

    /* renamed from: l */
    public final boolean f7947l;

    /* renamed from: m */
    public final Bitmap f7948m;

    /* renamed from: n */
    public final String f7949n;

    /* renamed from: o */
    public final String f7950o;

    /* renamed from: p */
    public final String f7951p;

    private cyy(String str, String str2, String str3, String str4, boolean z, boolean z2, Icon icon, int i, int i2, int i3, boolean z3, Bitmap bitmap, String str5, String str6, String str7) {
        this.f7937b = str;
        this.f7938c = str2;
        this.f7939d = str3;
        this.f7940e = str4;
        this.f7941f = z;
        this.f7942g = z2;
        this.f7943h = icon;
        this.f7944i = i;
        this.f7945j = i2;
        this.f7946k = i3;
        this.f7947l = z3;
        this.f7948m = bitmap;
        this.f7949n = str5;
        this.f7950o = str6;
        this.f7951p = str7;
    }

    /* renamed from: a */
    public static cyy m5983a(Cursor cursor) {
        Icon icon;
        Cursor cursor2 = cursor;
        String string = cursor2.getString(0);
        String string2 = cursor2.getString(1);
        String string3 = cursor2.getString(2);
        String string4 = cursor2.getString(3);
        boolean z = cursor2.getInt(4) != 0;
        boolean z2 = cursor2.getInt(5) != 0;
        byte[] blob = cursor2.getBlob(6);
        Parcel obtain = Parcel.obtain();
        if (blob != null) {
            obtain.unmarshall(blob, 0, blob.length);
            obtain.setDataPosition(0);
            icon = (Icon) obtain.readParcelable(Icon.class.getClassLoader());
        } else {
            icon = null;
        }
        obtain.recycle();
        int i = cursor2.getInt(7);
        int i2 = cursor2.getInt(8);
        int i3 = cursor2.getInt(9);
        boolean z3 = cursor2.getInt(10) != 0;
        byte[] blob2 = cursor2.getBlob(11);
        return new cyy(string, string2, string3, string4, z, z2, icon, i, i2, i3, z3, blob2 != null ? BitmapFactory.decodeByteArray(blob2, 0, blob2.length) : null, cursor2.getString(12), cursor2.getString(13), cursor2.getString(14));
    }

    /* renamed from: b */
    public static Object[] m5984b(Cursor cursor) {
        Cursor cursor2 = cursor;
        String string = cursor2.getString(0);
        String string2 = cursor2.getString(1);
        String string3 = cursor2.getString(2);
        String string4 = cursor2.getString(3);
        int i = cursor2.getInt(4);
        int i2 = cursor2.getInt(5);
        byte[] blob = cursor2.getBlob(6);
        int i3 = cursor2.getInt(7);
        int i4 = cursor2.getInt(8);
        int i5 = cursor2.getInt(9);
        int i6 = cursor2.getInt(10);
        return new Object[]{string, string2, string3, string4, Integer.valueOf(i), Integer.valueOf(i2), blob, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), cursor2.getBlob(11), cursor2.getString(12), cursor2.getString(13), cursor2.getString(14)};
    }
}
