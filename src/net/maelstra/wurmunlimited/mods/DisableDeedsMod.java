package net.maelstra.wurmunlimited.mods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

import mod.sin.lib.Util;

import com.wurmonline.server.TimeConstants;
import com.wurmonline.server.villages.Village;

import org.gotti.wurmunlimited.modloader.classhooks.HookException;
import org.gotti.wurmunlimited.modloader.classhooks.HookManager;

import org.gotti.wurmunlimited.modloader.interfaces.PreInitable;
import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;

public class DisableDeedsMod implements WurmServerMod, Configurable, PreInitable
{
    public static Logger logger;
    public static int gmPower = 5;

    public DisableDeedsMod()
    {
        DisableDeedsMod.logger = Logger.getLogger(this.getClass().getName());
    }

    public void configure(Properties properties)
    {
        DisableDeedsMod.logger.info("DisableDeedsMod: Loading configuration properties.");

        DisableDeedsMod.gmPower = Integer.parseInt(properties.getProperty("gmPower", Integer.toString(DisableDeedsMod.gmPower)));

        DisableDeedsMod.logger.info("DisableDeedsMod: Finished loading configuration properties.");

        if (DisableDeedsMod.gmPower < 0 || DisableDeedsMod.gmPower > 5)
        {
            DisableDeedsMod.gmPower = 5;
            DisableDeedsMod.logger.info("DisableDeedsMod: gmPower cannot be less than 0 or greater than 5! Setting to default value of 5; check your config file!");
        }
    }

    public void preInit()
    {
        try
        {
            String insert;
            ClassPool classPool = HookManager.getInstance().getClassPool();
            Class<DisableDeedsMod> thisClass = DisableDeedsMod.class;

            CtClass ctVillageFoundationQuestion = classPool.get("com.wurmonline.server.questions.VillageFoundationQuestion");

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  final StringBuilder buf2 = new StringBuilder(this.getBmlHeader());"
                   + "  buf2.append(\"text{text=\\\"\\\"}\");"
                   + "  buf2.append(\"text{text=\\\"Settlements are disabled here. Sorry!\\\"}\");"
                   + "  buf2.append(\"harray {button{text=\\\"Okay\\\";id=\\\"cancel\\\"}}}};null;null;}\");"
                   + "  this.getResponder().getCommunicator().sendBml(600, 500, true, false, buf2.toString(), 200, 200, 200, this.title);"
                   + "  return;"
                   + "}";

            Util.setReason("Disable settlement application form (sendIntro).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "sendIntro", insert);

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  final StringBuilder buf2 = new StringBuilder(this.getBmlHeader());"
                   + "  buf2.append(\"text{text=\\\"\\\"}\");"
                   + "  buf2.append(\"text{text=\\\"Settlements are disabled here. Sorry!\\\"}\");"
                   + "  buf2.append(\"harray {button{text=\\\"Okay\\\";id=\\\"cancel\\\"}}}};null;null;}\");"
                   + "  this.getResponder().getCommunicator().sendBml(600, 600, true, false, buf2.toString(), 200, 200, 200, this.title);"
                   + "  return;"
                   + "}";

            Util.setReason("Disable settlement application form (sendQuestion).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "sendQuestion", insert);

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  final StringBuilder buf2 = new StringBuilder(this.getBmlHeader());"
                   + "  buf2.append(\"text{text=\\\"\\\"}\");"
                   + "  buf2.append(\"text{text=\\\"Settlements are disabled here. Sorry!\\\"}\");"
                   + "  buf2.append(\"harray {button{text=\\\"Okay\\\";id=\\\"cancel\\\"}}}};null;null;}\");"
                   + "  this.getResponder().getCommunicator().sendBml(600, 600, true, false, buf2.toString(), 200, 200, 200, this.title);"
                   + "  return;"
                   + "}";

            Util.setReason("Disable settlement application form (sendQuestion2).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "sendQuestion2", insert);

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  final StringBuilder buf2 = new StringBuilder(this.getBmlHeader());"
                   + "  buf2.append(\"text{text=\\\"\\\"}\");"
                   + "  buf2.append(\"text{text=\\\"Settlements are disabled here. Sorry!\\\"}\");"
                   + "  buf2.append(\"harray {button{text=\\\"Okay\\\";id=\\\"cancel\\\"}}}};null;null;}\");"
                   + "  this.getResponder().getCommunicator().sendBml(600, 600, true, false, buf2.toString(), 200, 200, 200, this.title);"
                   + "  return;"
                   + "}";

            Util.setReason("Disable settlement application form (sendQuestion3).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "sendQuestion3", insert);

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  final StringBuilder buf2 = new StringBuilder(this.getBmlHeader());"
                   + "  buf2.append(\"text{text=\\\"\\\"}\");"
                   + "  buf2.append(\"text{text=\\\"Settlements are disabled here. Sorry!\\\"}\");"
                   + "  buf2.append(\"harray {button{text=\\\"Okay\\\";id=\\\"cancel\\\"}}}};null;null;}\");"
                   + "  this.getResponder().getCommunicator().sendBml(600, 600, true, false, buf2.toString(), 200, 200, 200, this.title);"
                   + "  return;"
                   + "}";

            Util.setReason("Disable settlement application form (sendQuestion4).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "sendQuestion4", insert);

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  final StringBuilder buf2 = new StringBuilder(this.getBmlHeader());"
                   + "  buf2.append(\"text{text=\\\"\\\"}\");"
                   + "  buf2.append(\"text{text=\\\"Settlements are disabled here. Sorry!\\\"}\");"
                   + "  buf2.append(\"harray {button{text=\\\"Okay\\\";id=\\\"cancel\\\"}}}};null;null;}\");"
                   + "  this.getResponder().getCommunicator().sendBml(600, 700, true, false, buf2.toString(), 200, 200, 200, this.title);"
                   + "  return;"
                   + "}";

            Util.setReason("Disable settlement application form (sendQuestion5).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "sendQuestion5", insert);

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  final StringBuilder buf2 = new StringBuilder(this.getBmlHeader());"
                   + "  buf2.append(\"text{text=\\\"\\\"}\");"
                   + "  buf2.append(\"text{text=\\\"Settlements are disabled here. Sorry!\\\"}\");"
                   + "  buf2.append(\"harray {button{text=\\\"Okay\\\";id=\\\"cancel\\\"}}}};null;null;}\");"
                   + "  this.getResponder().getCommunicator().sendBml(600, 430, true, false, buf2.toString(), 200, 200, 200, this.title);"
                   + "  return;"
                   + "}";

            Util.setReason("Disable settlement application form (sendQuestion6).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "sendQuestion6", insert);

            insert = "if(!this.expanding && this.getResponder().getPower()<" + DisableDeedsMod.gmPower + "){"
                   + "  return false;"
                   + "}";

            Util.setReason("Disable settlement application form (parseVillageFoundationQuestion1).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "parseVillageFoundationQuestion1", insert);

            Util.setReason("Disable settlement application form (parseVillageFoundationQuestion2).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "parseVillageFoundationQuestion2", insert);

            Util.setReason("Disable settlement application form (parseVillageFoundationQuestion3).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "parseVillageFoundationQuestion3", insert);

            Util.setReason("Disable settlement application form (parseVillageFoundationQuestion4).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "parseVillageFoundationQuestion4", insert);

            Util.setReason("Disable settlement application form (parseVillageFoundationQuestion5).");
            Util.insertBeforeDeclared(thisClass, ctVillageFoundationQuestion, "parseVillageFoundationQuestion5", insert);
        }
        catch (NotFoundException e)
        {
            throw new HookException(e);
        }
    }
}
