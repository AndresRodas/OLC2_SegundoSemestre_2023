import React from 'react';
import { useState } from 'react';
import { InputTextarea } from 'primereact/inputtextarea';
import { Button } from 'primereact/button';

import { PostMethod } from '../api/http';

const Home = () => {

    const [codeText, setCodeText] = useState('')
    const [consoleText, setConsoleText] = useState('')

    const Compile = async() => {
        const data = {
            Content: "print((5+6+9+7-23)*4)"
          }
        const resp = await PostMethod('Visitor', )
        console.log(resp)
    }

    return (
        <div>
            <div style={{display: 'flex'}}>
                <InputTextarea value={codeText} rows={8} cols={40} style={{marginBottom: '5%', marginRight: '2%'}} onChange={e => {setCodeText(e.target.value)}}/>
                <InputTextarea value={consoleText} rows={8} cols={40} style={{marginBottom: '5%', marginLeft: '2%'}} onChange={e => {setConsoleText(e.target.value)}}/>
            </div>
            <Button label="RUN" onClick={Compile} />
        </div>
    );
};

export default Home;
