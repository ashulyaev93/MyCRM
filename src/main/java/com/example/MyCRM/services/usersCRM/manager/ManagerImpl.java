package com.example.MyCRM.services.usersCRM.manager;

import com.example.MyCRM.models.managerActions.Sale;
import com.example.MyCRM.services.usersCRM.manager.worksManager.DocumentationWorker;
import com.example.MyCRM.services.usersCRM.manager.worksManager.SaleWorker;
import com.example.MyCRM.services.usersCRM.manager.worksManager.entity.AddDocument;
import com.example.MyCRM.services.usersCRM.manager.worksManager.entity.SaleCard;
import org.springframework.stereotype.Service;

@Service
public class ManagerImpl implements Manager {
    private SaleWorker makeNewSale;
    private DocumentationWorker createNewDocument;

    public ManagerImpl(){
        this.makeNewSale = new SaleCard();
        this.createNewDocument = new AddDocument();
    }

    @Override
    public String addDocumentation(String writeText, String saveDoc, String editDoc) {
        String newDoc = createNewDocument.createDocument(writeText, saveDoc, editDoc);
        return newDoc;
    }

    @Override
    public String createSale(String findClient, String callUp, String createOrder) {
        String newSale = makeNewSale.makeSale(findClient, callUp, createOrder);
        return newSale;
    }
}
