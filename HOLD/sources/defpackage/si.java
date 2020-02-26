package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: si  reason: default package */
/* compiled from: PG */
public final class si implements ComponentCallbacks2 {
    private static volatile si g;
    private static volatile boolean h;
    public final xg a;
    public final sl b;
    public final ss c;
    public final xe d;
    public final afq e;
    public final List f = new ArrayList();
    private final yj i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ss.a(java.lang.Class, ua):void
     arg types: [java.lang.Class, ace]
     candidates:
      ss.a(java.lang.Class, tp):void
      ss.a(java.lang.Class, ua):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ss.a(java.lang.Class, ua):void
     arg types: [java.lang.Class, acd]
     candidates:
      ss.a(java.lang.Class, tp):void
      ss.a(java.lang.Class, ua):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ss.a(java.lang.Class, ua):void
     arg types: [java.lang.Class, aei]
     candidates:
      ss.a(java.lang.Class, tp):void
      ss.a(java.lang.Class, ua):void */
    private si(Context context, wf wfVar, yj yjVar, xg xgVar, xe xeVar, afq afq, Map map, List list) {
        si siVar;
        Context context2 = context;
        xg xgVar2 = xgVar;
        xe xeVar2 = xeVar;
        Class<byte[]> cls = byte[].class;
        this.a = xgVar2;
        this.d = xeVar2;
        this.i = yjVar;
        this.e = afq;
        Resources resources = context.getResources();
        ss ssVar = new ss();
        this.c = ssVar;
        ssVar.a((tr) new aco());
        if (Build.VERSION.SDK_INT >= 27) {
            this.c.a((tr) new adb());
        }
        List a2 = this.c.a();
        aee aee = new aee(context2, a2, xgVar2, xeVar2);
        adt adt = new adt(xgVar2, new ads());
        acx acx = new acx(this.c.a(), resources.getDisplayMetrics(), xgVar2, xeVar2);
        ach ach = new ach(acx);
        adj adj = new adj(acx, xeVar2);
        aea aea = new aea(context2);
        aav aav = new aav(resources);
        aaw aaw = new aaw(resources);
        aau aau = new aau(resources);
        aat aat = new aat(resources);
        Class<byte[]> cls2 = cls;
        ace ace = new ace(xeVar2);
        aes aes = new aes();
        aev aev = new aev();
        ContentResolver contentResolver = context.getContentResolver();
        ss ssVar2 = this.c;
        aat aat2 = aat;
        ssVar2.a(ByteBuffer.class, new zg());
        ssVar2.a(InputStream.class, new aay(xeVar2));
        ssVar2.a("Bitmap", ByteBuffer.class, Bitmap.class, ach);
        ssVar2.a("Bitmap", InputStream.class, Bitmap.class, adj);
        ssVar2.a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, adt);
        aau aau2 = aau;
        ssVar2.a("Bitmap", AssetFileDescriptor.class, Bitmap.class, new adt(xgVar2, new adq((byte) 0)));
        ssVar2.a(Bitmap.class, Bitmap.class, abd.a);
        ssVar2.a("Bitmap", Bitmap.class, Bitmap.class, new adn());
        ssVar2.a(Bitmap.class, (ua) ace);
        ssVar2.a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new acc(resources, ach));
        ssVar2.a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new acc(resources, adj));
        ssVar2.a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new acc(resources, adt));
        ssVar2.a(BitmapDrawable.class, (ua) new acd(xgVar2, ace));
        ssVar2.a("Gif", InputStream.class, aeh.class, new aer(a2, aee, xeVar2));
        ssVar2.a("Gif", ByteBuffer.class, aeh.class, aee);
        ssVar2.a(aeh.class, (ua) new aei());
        ssVar2.a(tj.class, tj.class, abd.a);
        ssVar2.a("Bitmap", tj.class, Bitmap.class, new aep(xgVar2));
        ssVar2.a(Uri.class, Drawable.class, aea);
        ssVar2.a(Uri.class, Bitmap.class, new adh(aea, xgVar2));
        ssVar2.a((uh) new adu());
        ssVar2.a(File.class, ByteBuffer.class, new zi());
        ssVar2.a(File.class, InputStream.class, new zp((byte) 0));
        ssVar2.a(File.class, File.class, new aec());
        ssVar2.a(File.class, ParcelFileDescriptor.class, new zp());
        ssVar2.a(File.class, File.class, abd.a);
        ssVar2.a((uh) new uq(xeVar2));
        ssVar2.a(Integer.TYPE, InputStream.class, aav);
        aau aau3 = aau2;
        ssVar2.a(Integer.TYPE, ParcelFileDescriptor.class, aau3);
        ssVar2.a(Integer.class, InputStream.class, aav);
        ssVar2.a(Integer.class, ParcelFileDescriptor.class, aau3);
        aaw aaw2 = aaw;
        ssVar2.a(Integer.class, Uri.class, aaw2);
        aat aat3 = aat2;
        ssVar2.a(Integer.TYPE, AssetFileDescriptor.class, aat3);
        ssVar2.a(Integer.class, AssetFileDescriptor.class, aat3);
        ssVar2.a(Integer.TYPE, Uri.class, aaw2);
        ssVar2.a(String.class, InputStream.class, new zn());
        ssVar2.a(Uri.class, InputStream.class, new zn());
        ssVar2.a(String.class, InputStream.class, new abb());
        ssVar2.a(String.class, ParcelFileDescriptor.class, new aba());
        ssVar2.a(String.class, AssetFileDescriptor.class, new aaz());
        ssVar2.a(Uri.class, InputStream.class, new abp());
        ssVar2.a(Uri.class, InputStream.class, new yx(context.getAssets()));
        ssVar2.a(Uri.class, ParcelFileDescriptor.class, new yw(context.getAssets()));
        Context context3 = context;
        aes aes2 = aes;
        ssVar2.a(Uri.class, InputStream.class, new abr(context3));
        ssVar2.a(Uri.class, InputStream.class, new abt(context3));
        if (Build.VERSION.SDK_INT >= 29) {
            siVar = this;
            siVar.c.a(Uri.class, InputStream.class, new abv(context3, (byte) 0));
            siVar.c.a(Uri.class, ParcelFileDescriptor.class, new abv(context3));
        } else {
            siVar = this;
        }
        ss ssVar3 = siVar.c;
        ContentResolver contentResolver2 = contentResolver;
        ssVar3.a(Uri.class, InputStream.class, new abj(contentResolver2));
        ssVar3.a(Uri.class, ParcelFileDescriptor.class, new abh(contentResolver2));
        ssVar3.a(Uri.class, AssetFileDescriptor.class, new abg(contentResolver2));
        ssVar3.a(Uri.class, InputStream.class, new abl());
        ssVar3.a(URL.class, InputStream.class, new aby());
        ssVar3.a(Uri.class, File.class, new aab(context3));
        ssVar3.a(zv.class, InputStream.class, new abn());
        Class<byte[]> cls3 = cls2;
        ssVar3.a(cls3, ByteBuffer.class, new za());
        ssVar3.a(cls3, InputStream.class, new ze());
        ssVar3.a(Uri.class, Uri.class, abd.a);
        ssVar3.a(Drawable.class, Drawable.class, abd.a);
        ssVar3.a(Drawable.class, Drawable.class, new aeb());
        ssVar3.a(Bitmap.class, BitmapDrawable.class, new aet(resources));
        ssVar3.a(Bitmap.class, cls3, aes2);
        aev aev2 = aev;
        ssVar3.a(Drawable.class, cls3, new aeu(xgVar2, aes2, aev2));
        ssVar3.a(aeh.class, cls3, aev2);
        siVar.b = new sl(context, xeVar, siVar.c, map, list, wfVar);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void b() {
        aie.a();
        this.i.a();
        this.a.a();
        this.d.a();
    }

    public static si a(Context context) {
        if (g == null) {
            GeneratedAppGlideModule d2 = d(context.getApplicationContext());
            synchronized (si.class) {
                if (g == null) {
                    if (!h) {
                        h = true;
                        a(context, new sk(), d2);
                        h = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return g;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException e2) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e3) {
            a(e3);
            return null;
        } catch (IllegalAccessException e4) {
            a(e4);
            return null;
        } catch (NoSuchMethodException e5) {
            a(e5);
            return null;
        } catch (InvocationTargetException e6) {
            a(e6);
            return null;
        }
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public static afq b(Context context) {
        aic.a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e;
    }

    private static void a(Context context, sk skVar, GeneratedAppGlideModule generatedAppGlideModule) {
        int i2;
        sk skVar2 = skVar;
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (generatedAppGlideModule == null) {
            afy afy = new afy(applicationContext);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = afy.a.getPackageManager().getApplicationInfo(afy.a.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(afy.a(next));
                        }
                    }
                }
                int size = arrayList.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    ((afw) arrayList.get(i4)).a();
                }
                if (skVar2.f == null) {
                    yr yrVar = new yr(false);
                    yrVar.a(yu.a());
                    yrVar.a = "source";
                    skVar2.f = yrVar.a();
                }
                if (skVar2.g == null) {
                    yr yrVar2 = new yr(true);
                    yrVar2.a(1);
                    yrVar2.a = "disk-cache";
                    skVar2.g = yrVar2.a();
                }
                if (skVar2.k == null) {
                    if (yu.a() >= 4) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    yr yrVar3 = new yr(true);
                    yrVar3.a(i2);
                    yrVar3.a = "animation";
                    skVar2.k = yrVar3.a();
                }
                if (skVar2.i == null) {
                    skVar2.i = new yn(new yk(applicationContext));
                }
                if (skVar2.j == null) {
                    skVar2.j = new afh();
                }
                if (skVar2.c == null) {
                    int i5 = skVar2.i.a;
                    if (i5 > 0) {
                        skVar2.c = new xp((long) i5);
                    } else {
                        skVar2.c = new xh();
                    }
                }
                if (skVar2.d == null) {
                    skVar2.d = new xo(skVar2.i.c);
                }
                if (skVar2.e == null) {
                    skVar2.e = new yh((long) skVar2.i.b);
                }
                if (skVar2.h == null) {
                    skVar2.h = new ye(applicationContext);
                }
                if (skVar2.b == null) {
                    skVar2.b = new wf(skVar2.e, skVar2.h, skVar2.g, skVar2.f, new yu(new ThreadPoolExecutor(0, Integer.MAX_VALUE, yu.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new yt("source-unlimited", false))), skVar2.k);
                }
                List list = skVar2.l;
                if (list != null) {
                    skVar2.l = Collections.unmodifiableList(list);
                } else {
                    skVar2.l = Collections.emptyList();
                }
                si siVar = new si(applicationContext, skVar2.b, skVar2.e, skVar2.c, skVar2.d, new afq(), skVar2.a, skVar2.l);
                int size2 = arrayList.size();
                while (i3 < size2) {
                    afw afw = (afw) arrayList.get(i3);
                    try {
                        afw.a(applicationContext, siVar.c);
                        i3++;
                    } catch (AbstractMethodError e2) {
                        String valueOf = String.valueOf(afw.getClass().getName());
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ") : "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(valueOf), e2);
                    }
                }
                applicationContext.registerComponentCallbacks(siVar);
                g = siVar;
            } catch (PackageManager.NameNotFoundException e3) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e3);
            }
        } else {
            throw null;
        }
    }

    public final void onLowMemory() {
        b();
    }

    public final void onTrimMemory(int i2) {
        aie.a();
        List list = this.f;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            sx sxVar = (sx) list.get(i3);
        }
        yj yjVar = this.i;
        if (i2 >= 40) {
            ((ahz) yjVar).a();
        } else if (i2 >= 20 || i2 == 15) {
            ahz ahz = (ahz) yjVar;
            ahz.a(ahz.b() / 2);
        }
        this.a.a(i2);
        this.d.a(i2);
    }

    private static void a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static sx a(Activity activity) {
        return b(activity).a(activity);
    }

    public static sx c(Context context) {
        return b(context).a(context);
    }
}
