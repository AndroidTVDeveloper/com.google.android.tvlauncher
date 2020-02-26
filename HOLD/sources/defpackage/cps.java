package defpackage;

import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.tvlauncher.R;

/* renamed from: cps  reason: default package */
/* compiled from: PG */
final class cps extends AsyncTask {
    private final /* synthetic */ cpt a;

    public /* synthetic */ cps(cpt cpt) {
        this.a = cpt;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void}
     arg types: [int, int, int, int, int, int, android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int, int, android.graphics.Shader$TileMode):void}
     arg types: [int, int, float, int, int, android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int, int, android.graphics.Shader$TileMode):void} */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        cpt cpt = this.a;
        BitmapDrawable bitmapDrawable = ((BitmapDrawable[]) objArr)[0];
        int i = cpt.c;
        int i2 = cpt.b;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 540.0f, Color.rgb((int) ((((float) Color.red(i)) * 0.2f) + (((float) Color.red(i2)) * 0.8f)), (int) ((((float) Color.green(i)) * 0.2f) + (((float) Color.green(i2)) * 0.8f)), (int) ((((float) Color.blue(i)) * 0.2f) + (((float) Color.blue(i2)) * 0.8f))), cpt.c, Shader.TileMode.CLAMP);
        if (cpt.f == null) {
            cpt.f = new Paint();
        }
        cpt.f.setShader(linearGradient);
        cpt.f.setDither(true);
        RadialGradient radialGradient = new RadialGradient(960.0f, -300.0f, (float) ((int) Math.sqrt(1627200.0d)), cpt.d, 0, Shader.TileMode.CLAMP);
        if (cpt.g == null) {
            cpt.g = new Paint();
        }
        cpt.g.setShader(radialGradient);
        cpt.g.setDither(true);
        if (cpt.h == null) {
            cpt.h = BitmapFactory.decodeResource(cpt.a.getResources(), R.drawable.home_background_overlay);
            cpt.i = new Paint();
            cpt.i.setShader(new BitmapShader(cpt.h, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        }
        Canvas canvas = new Canvas(bitmapDrawable.getBitmap());
        canvas.drawRect(0.0f, 0.0f, 960.0f, 540.0f, cpt.f);
        canvas.drawRect(0.0f, 0.0f, 960.0f, 540.0f, cpt.g);
        canvas.drawRect(0.0f, 0.0f, 960.0f, 540.0f, cpt.i);
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        cpt cpt = this.a;
        cpt.j = null;
        ddd ddd = cpt.k;
        if (ddd.a) {
            Log.w("BackgroundTransition", "animateFadeIn called while the previous animation is still running.");
        }
        ddd.b = SystemClock.uptimeMillis();
        ddd.c = 600;
        ddd.a = true;
        Drawable drawable = ddd.getDrawable(0);
        ddd.setDrawable(0, ddd.getDrawable(1));
        ddd.setDrawable(1, ddd.getDrawable(2));
        ddd.setDrawable(2, drawable);
        ddd.invalidateSelf();
    }
}
