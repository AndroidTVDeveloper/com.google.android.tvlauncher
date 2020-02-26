package com.google.android.tvlauncher.appsview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class AddAppLinkActivity extends cfu {
    public cfp a;
    public ImageView c;
    public int d;
    private LinearLayout e;
    private ImageView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private Button k;
    private Button l;
    private Button m;
    private agj n;

    public AddAppLinkActivity() {
        super("AddAppLinkActivity");
    }

    public final void a() {
        setResult(0);
        finish();
    }

    private static final boolean a(Intent intent, String str) {
        return intent.hasExtra(str) && !TextUtils.isEmpty(intent.getStringExtra(str));
    }

    public final void onBackPressed() {
        a();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = this.b;
        setContentView((int) R.layout.add_applink_dialog);
        this.e = (LinearLayout) findViewById(R.id.dialog_view);
        this.f = (ImageView) findViewById(R.id.app_icon);
        this.c = (ImageView) findViewById(R.id.app_screenshot);
        this.g = (TextView) findViewById(R.id.app_title);
        this.h = (TextView) findViewById(R.id.app_developer);
        this.i = (TextView) findViewById(R.id.app_description);
        this.j = (TextView) findViewById(R.id.app_category);
        this.k = (Button) findViewById(R.id.open_button);
        this.l = (Button) findViewById(R.id.allow_button);
        this.m = (Button) findViewById(R.id.deny_button);
        this.d = getResources().getDimensionPixelSize(R.dimen.applink_dialog_image_rounded_corner_radius);
        ColorDrawable colorDrawable = new ColorDrawable(bg.b(this, R.color.app_banner_background_color));
        this.n = new agj((byte) 0).a(colorDrawable).c(colorDrawable).a(vy.a).a((ub) new dae(getColor(R.color.app_banner_background_color), true));
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.format = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        a(getIntent());
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.a((Activity) this);
    }

    private final void a(Intent intent) {
        String callingPackage = getCallingPackage();
        if (callingPackage == null || !dcy.a(this, callingPackage) || !a(intent, "EXTRA_APP_NAME") || !a(intent, "EXTRA_PACKAGE_NAME") || !a(intent, "EXTRA_BANNER_URI") || !a(intent, "EXTRA_DATA_URI") || !a(intent, "EXTRA_DEVELOPER") || !a(intent, "EXTRA_CATEGORY") || !a(intent, "EXTRA_DESCRIPTION") || !intent.hasExtra("EXTRA_IS_GAME")) {
            Log.e("AddAppLinkActivity", String.format("The metadata for installing the app link is invalid. App name: %s, Package name: %s, Banner uri: %s, Data uri: %s, Developer: %s , Category: %s, Description: %s, has IsGame extra: %s", intent.getStringExtra("EXTRA_APP_NAME"), intent.getStringExtra("EXTRA_PACKAGE_NAME"), intent.getStringExtra("EXTRA_BANNER_URI"), intent.getStringExtra("EXTRA_DATA_URI"), intent.getStringExtra("EXTRA_DEVELOPER"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_DESCRIPTION"), Boolean.valueOf(intent.hasExtra("EXTRA_IS_GAME"))));
            a();
            return;
        }
        dbx dbx = new dbx((byte) 0);
        dbx.a = intent.getStringExtra("EXTRA_APP_NAME");
        dbx.b = intent.getStringExtra("EXTRA_PACKAGE_NAME");
        dbx.c = intent.getStringExtra("EXTRA_BANNER_URI");
        dbx.d = intent.getStringExtra("EXTRA_DATA_URI");
        dbx.e = intent.getStringExtra("EXTRA_DEVELOPER");
        dbx.f = intent.getStringExtra("EXTRA_CATEGORY");
        dbx.g = intent.getStringExtra("EXTRA_DESCRIPTION");
        dbx.h = intent.getBooleanExtra("EXTRA_IS_GAME", false);
        dbx.i = true;
        dby a2 = dbx.a();
        if (cim.a(this).a(a2.k) != null) {
            Log.e("AddAppLinkActivity", "The app link is already installed");
            a();
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_SCREENSHOTS");
        if (stringArrayExtra != null && stringArrayExtra.length > 0) {
            a2.j.addAll(Arrays.asList(stringArrayExtra));
        }
        if (!isFinishing() && !isDestroyed()) {
            this.k.setOnClickListener(new cgh(this, a2));
            this.l.setText((int) R.string.add);
            this.l.setOnClickListener(new cgi(this, a2));
            this.m.setOnClickListener(new cgj(this, a2));
            Spanned fromHtml = Html.fromHtml(getResources().getString(R.string.app_category, TextUtils.htmlEncode(a2.h)), 0);
            this.g.setText(a2.a);
            this.h.setText(a2.g);
            this.i.setText(a2.i);
            this.j.setText(fromHtml);
            this.e.setVisibility(0);
            this.k.requestFocus();
            cgk cgk = new cgk(this);
            this.f.setOutlineProvider(cgk);
            this.f.setClipToOutline(true);
            si.a((Activity) this).a(a2.c).b(this.n).a(this.f);
            List a3 = a2.a();
            if (!a3.isEmpty()) {
                this.c.setOutlineProvider(cgk);
                this.c.setClipToOutline(true);
                si.a((Activity) this).a((String) a3.get(0)).a((ahg) new cgl(this));
                return;
            }
            return;
        }
        Log.e("AddAppLinkActivity", "Activity is no longer running");
    }
}
