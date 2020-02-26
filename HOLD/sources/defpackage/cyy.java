package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Parcel;

/* renamed from: cyy  reason: default package */
/* compiled from: PG */
public final class cyy {
    public static final String[] a = {"sbn_key", "package_name", "title", "text", "dismissible", "ongoing", "small_icon", "channel", "progress", "progress_max", "has_content_intent", "big_picture", "content_button_label", "dismiss_button_label", "tag"};
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final Icon h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Bitmap m;
    public final String n;
    public final String o;
    public final String p;

    private cyy(String str, String str2, String str3, String str4, boolean z, boolean z2, Icon icon, int i2, int i3, int i4, boolean z3, Bitmap bitmap, String str5, String str6, String str7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = icon;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = z3;
        this.m = bitmap;
        this.n = str5;
        this.o = str6;
        this.p = str7;
    }

    public static cyy a(Cursor cursor) {
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
        int i2 = cursor2.getInt(7);
        int i3 = cursor2.getInt(8);
        int i4 = cursor2.getInt(9);
        boolean z3 = cursor2.getInt(10) != 0;
        byte[] blob2 = cursor2.getBlob(11);
        return new cyy(string, string2, string3, string4, z, z2, icon, i2, i3, i4, z3, blob2 != null ? BitmapFactory.decodeByteArray(blob2, 0, blob2.length) : null, cursor2.getString(12), cursor2.getString(13), cursor2.getString(14));
    }

    public static Object[] b(Cursor cursor) {
        Cursor cursor2 = cursor;
        String string = cursor2.getString(0);
        String string2 = cursor2.getString(1);
        String string3 = cursor2.getString(2);
        String string4 = cursor2.getString(3);
        int i2 = cursor2.getInt(4);
        int i3 = cursor2.getInt(5);
        byte[] blob = cursor2.getBlob(6);
        int i4 = cursor2.getInt(7);
        int i5 = cursor2.getInt(8);
        int i6 = cursor2.getInt(9);
        int i7 = cursor2.getInt(10);
        return new Object[]{string, string2, string3, string4, Integer.valueOf(i2), Integer.valueOf(i3), blob, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), cursor2.getBlob(11), cursor2.getString(12), cursor2.getString(13), cursor2.getString(14)};
    }
}
