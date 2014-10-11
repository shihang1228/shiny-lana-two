package com.baldurtech.contact;

import org.mockito.Mock;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.baldurtech.config.WebAppConfigurationAware;

public class ContactServiceTest {

    ContactRepository contactRepository;
    ContactService contactService;
    
    @Before 
    public void setup() {
        contactRepository = mock(ContactRepository.class);
        contactService = new ContactService(contactRepository);
    }
    
    @Test
    public void contactServiceInvokeContactRepositoryMethod(){
        contactService.getContactList();
        verify(contactRepository).getAllContacts();
    }
}